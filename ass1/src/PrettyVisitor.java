import java.util.List;

public class PrettyVisitor extends gramBaseVisitor <String> {

    @Override public String visitBracExp(gramParser.BracExpContext ctx) { // '(' expression ')'
        StringBuilder str = new StringBuilder();
        str.append("(");
        for(int i =1; i < ctx.children.size()-1; i++){
            String loopStr = visit(ctx.children.get(i));
            str.append(loopStr);
        }
        str.append(")");
        return str.toString();
    }

    @Override public String visitDefExp(gramParser.DefExpContext ctx) { // '-'(if there is one) INT/FLOAT
        return ctx.getText();
    }

    @Override public String visitPowExp(gramParser.PowExpContext ctx) { // val ** val
        String str = "";
        str += (ctx.left.getText());
        str+=("**");
        str+=(ctx.right.getText());
        return str;
    }

    @Override public String visitDivMultiExp(gramParser.DivMultiExpContext ctx) { //val * or / val
        String str = "";
        str+=(ctx.left.getText());
        str+=(ctx.op.getText());
        str+=(ctx.right.getText());
        return str;
    }

    @Override public String visitAddMinusExp(gramParser.AddMinusExpContext ctx) { // val + or - val

        StringBuilder str = new StringBuilder();
        str.append(ctx.left.getText()).append(ctx.op.getText()).append(ctx.right.getText());
        return str.toString();
    }


    @Override public String visitAssignment(gramParser.AssignmentContext ctx) { // varName '=' val
        String varName = ctx.varName.getText();

        return varName + "=" + visit(ctx.varExpr) + ";";
    }

    @Override public String visitParse(gramParser.ParseContext ctx) { // iterate through all the nodes

        StringBuilder str = new StringBuilder();
        str.append("\n");
        for(int i = 0; i < ctx.children.size(); i++){
            str.append(visit(ctx.children.get(i)));
            str.append("\n");
        }
        return str.toString();
    }


    @Override public String visitIf_start(gramParser.If_startContext ctx) { // 'if' statment 'else if' statment 'else' statment
        StringBuilder str = new StringBuilder();
        str.append("if ");
        List<gramParser.Cdn_expContext> conditions = ctx.cdn_exp();

        boolean elseIF = true;


        for(gramParser.Cdn_expContext condition : conditions){
            String val = visit(condition.exp());
            if(val != null){
                str.append(val);
                str.append(visit(condition.stat_exp()));
                if(ctx.ELSE() != null && elseIF){
                    str.append("else if ");
                    elseIF = false;
                }
            }
        }

        if(ctx.stat_exp() != null){
            str.append("else");
            str.append(visit(ctx.stat_exp()));
        }

        return str.toString();
    }

    @Override public String visitCdn_exp(gramParser.Cdn_expContext ctx) { // prints the contents of the condition block
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < ctx.children.size(); i++){
            str.append(visit(ctx.children.get(i)));
        }
        return str.toString();
    }

    @Override public String visitStat_exp(gramParser.Stat_expContext ctx) { //prints the content of the statement block
        String str = "";
        str+=("{\n");
        str+=(visit(ctx.children.get(1)));
        str+=("\n}");
        return str;
    }

    @Override public String visitNormExp(gramParser.NormExpContext ctx) { // prints the 'number'
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < ctx.children.size(); i++){
            str.append(visit(ctx.children.get(i)));
        }
        return str.toString();
    }

    @Override public String visitMinusExp(gramParser.MinusExpContext ctx) { // inverts the number
        StringBuilder str = new StringBuilder();
        str.append("-");
        for(int i = 1; i < ctx.children.size(); i++){
            str.append(visit(ctx.children.get(i)));
        }
        return str.toString(); }

    @Override public String visitAndExp(gramParser.AndExpContext ctx) { //val && val
        StringBuilder str = new StringBuilder();
        String left = visit(ctx.left);
        String right = visit(ctx.right);
        str.append(left).append(" && ").append(right);
        return str.toString();
    }

    @Override public String visitOrExp(gramParser.OrExpContext ctx) { // val || val
        StringBuilder str = new StringBuilder();
        String left = visit(ctx.left);
        String right = visit(ctx.right);
        str.append(left).append(" || ").append(right);
        return str.toString();
    }

    @Override public String visitRelationalExpr(gramParser.RelationalExprContext ctx) { //val <=,<,=>,>
        StringBuilder str = new StringBuilder();
        String left = visit(ctx.left);
        String right = visit(ctx.right);
        String op = ctx.op.getText();
        str.append(left).append(" " + op + " ").append(right);
        return str.toString();
    }

    @Override public String visitNotExp(gramParser.NotExpContext ctx) { // '!' var
        StringBuilder str = new StringBuilder();
        str.append("!").append(visit(ctx.children.get(1)));
        return str.toString();
    }

    @Override public String visitEqualityExpr(gramParser.EqualityExprContext ctx) {  // var == != var
        StringBuilder str = new StringBuilder();
        String left = visit(ctx.left);
        String right = visit(ctx.right);
        String op = ctx.op.getText();
        str.append(left).append(" " + op + " ").append(right);
        return str.toString();
    }

    @Override public String visitBoolExp(gramParser.BoolExpContext ctx) { //(NOT) T/F
        return ctx.getText();
    }

    @Override public String visitVarExp(gramParser.VarExpContext ctx) { //var
        return ctx.getText();
    }

    @Override public String visitEvalExp(gramParser.EvalExpContext ctx) { // [expression]
        return '[' + visit(ctx.exp()) + ']'; }

}


