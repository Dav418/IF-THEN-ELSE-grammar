import java.util.HashMap;
import java.util.List;


public class gramEval extends gramBaseVisitor <ApexVal> {

    private HashMap<String,ApexVal> memory = new HashMap<>();// store variables

    private static final double SMALL_VALUE = 0.00000000001; // compare Doubles

    private int i = 0; // number of evals done

    @Override public ApexVal visitParse(gramParser.ParseContext ctx) {
        return visitChildren(ctx);
    }

    @Override public ApexVal visitAssignment(gramParser.AssignmentContext ctx) { //place variable into memory
        String varName = ctx.varName.getText();
        ApexVal varVal = visit(ctx.varExpr);

        return memory.put(varName,varVal);
    }

    @Override public ApexVal visitNormExp(gramParser.NormExpContext ctx) {
        return visitChildren(ctx);
    }

    @Override public ApexVal visitMinusExp(gramParser.MinusExpContext ctx) { //invert val
        ApexVal val = visit(ctx.exp());
        return new ApexVal(-val.asDouble());
    }

    @Override public ApexVal visitAndExp(gramParser.AndExpContext ctx) { //boolean &&
        ApexVal left = visit(ctx.left);
        ApexVal right = visit(ctx.right);

        return new ApexVal(left.asBool() && right.asBool());
    }

    @Override public ApexVal visitPowExp(gramParser.PowExpContext ctx) { //val ** val
        ApexVal left = visit(ctx.left);
        ApexVal right = visit(ctx.right);

        return new ApexVal(Math.pow(left.asDouble(),right.asDouble())); }

    @Override public ApexVal visitDivMultiExp(gramParser.DivMultiExpContext ctx)  { //val * or / val
        ApexVal left = visit(ctx.left);
        ApexVal right = visit(ctx.right);

        ApexVal rtnVal;
        String op = ctx.op.getText();

        switch (op){
            case "*":
                rtnVal = new ApexVal(left.asDouble()*right.asDouble());
                break;
            case "/":
                rtnVal = new ApexVal(left.asDouble()/right.asDouble());
                break;
                default:
                    throw new RuntimeException("Unknown operator " + op);
        }
        return rtnVal;
    }

    @Override public ApexVal visitAddMinusExp(gramParser.AddMinusExpContext ctx) { //val + or - val

        ApexVal left = visit(ctx.left);
        ApexVal right = visit(ctx.right);

        ApexVal rtnVal;
        String op = ctx.op.getText();

        switch (op){
            case "+":
                rtnVal = new ApexVal(left.asDouble()+right.asDouble());
                break;
            case "-":
                rtnVal = new ApexVal(left.asDouble()-right.asDouble());
                break;
            default:
                throw new RuntimeException("Unknown operator " + op);
        }
        return rtnVal;
    }

    @Override public ApexVal visitBracExp(gramParser.BracExpContext ctx) {
        return visit(ctx.exp());
    }

    @Override public ApexVal visitOrExp(gramParser.OrExpContext ctx) { // boolean ||
        ApexVal left = visit(ctx.left);
        ApexVal right = visit(ctx.right);

        return new ApexVal(left.asBool() || right.asBool());
    }

    @Override public ApexVal visitRelationalExpr(gramParser.RelationalExprContext ctx) { // val <,<=,>,>= val

        ApexVal left = visit(ctx.left);
        ApexVal right = visit(ctx.right);

        ApexVal rtnVal;
        String op = ctx.op.getText();

        switch (op){
            case "<":
                rtnVal = new ApexVal(left.asDouble()<right.asDouble());
                break;
            case ">":
                rtnVal = new ApexVal(left.asDouble()>right.asDouble());
                break;
            case ">=":
                rtnVal = new ApexVal(left.asDouble()>=right.asDouble());
                break;
            case "<=":
                rtnVal = new ApexVal(left.asDouble()<=right.asDouble());
                break;
            default:
                throw new RuntimeException("Unknown operator " + op);
        }
        return rtnVal;
    }

    @Override public ApexVal visitNotExp(gramParser.NotExpContext ctx) {
        ApexVal val = visit(ctx.exp());

        return new ApexVal(!val.asBool());
    }

    @Override public ApexVal visitEqualityExpr(gramParser.EqualityExprContext ctx) { // val == or != val
        ApexVal left = visit(ctx.left);
        ApexVal right = visit(ctx.right);

        ApexVal rtnVal;
        String op = ctx.op.getText();

        switch (op){
            case "==":
                if(left.asBool() && right.asBool()){
                    rtnVal = new ApexVal(Math.abs(left.asDouble() - right.asDouble()) < SMALL_VALUE);
                }else{
                    rtnVal = new ApexVal(left.equals(right));
                }
                break;
            case "!=":
                if(left.asBool() && right.asBool()){
                    rtnVal = new ApexVal(Math.abs(left.asDouble() - right.asDouble()) >= SMALL_VALUE);
                }else{
                    rtnVal = new ApexVal(left.equals(right));
                }
                break;
            default:
                throw new RuntimeException("unknown operator: " + op);
        }
        return rtnVal;
    }

    @Override public ApexVal visitDefExp(gramParser.DefExpContext ctx) {
        return new ApexVal(Double.valueOf(ctx.getText()));
    }

    @Override public ApexVal visitBoolExp(gramParser.BoolExpContext ctx) {
        return new ApexVal(Boolean.valueOf(ctx.getText()));
    }

    @Override public ApexVal visitVarExp(gramParser.VarExpContext ctx) {
        return memory.get(ctx.getText());
    }

    @Override public ApexVal visitIf_start(gramParser.If_startContext ctx) {

        List<gramParser.Cdn_expContext> conditions = ctx.cdn_exp(); //get the conditions

        boolean evalBlock = false;

        for(gramParser.Cdn_expContext condition : conditions){ // loop through them
            ApexVal val = visit(condition.exp()); // eval the condition after the initial if

            if(val.asBool()){
                evalBlock = true;
                visit(condition.stat_exp()); //eval the else if
                break;
            }
        }

        if(!evalBlock && ctx.stat_exp() != null){ //then the else
            visit(ctx.stat_exp());
        }

        return new ApexVal(false); // return dont matter
    }

    @Override public ApexVal visitCdn_exp(gramParser.Cdn_expContext ctx) {
        return visitChildren(ctx);
    }

    @Override public ApexVal visitStat_exp(gramParser.Stat_expContext ctx) {
        return visitChildren(ctx);
    }

    @Override public ApexVal visitEvalExp(gramParser.EvalExpContext ctx) { // evaluate the expression and return number of evals done
        ApexVal val = visit(ctx.exp());
        System.out.println("Eval #" + ++i + ": "+val.toString());

        return new ApexVal(i);
    }



}
