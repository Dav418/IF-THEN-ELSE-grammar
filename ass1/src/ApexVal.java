public class ApexVal {

    final Object val;

    public ApexVal(Object v){
        this.val = v;
    }

    public Boolean asBool(){
        return (Boolean)val;
    } // change val t o Bool

    public Double asDouble(){
        return (Double)val;
    } //change val to Double


    @Override
    public int hashCode() {

        if(val == null) {
            return 0;
        }

        return this.val.hashCode();
    }

    @Override
    public boolean equals(Object o) { // to compare

        if(val == o) {
            return true;
        }

        if(val == null || o == null || o.getClass() != val.getClass()) {
            return false;
        }

        ApexVal that = (ApexVal)o;

        return this.val.equals(that.val);
    }

    @Override
    public String toString() {
        return String.valueOf(val);
    }

}
