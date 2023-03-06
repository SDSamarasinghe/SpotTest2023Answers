package Question03;

public class Query {
    public String SELECT;
    public String FROM;
    public String WHERE;
    public String ORDERBY;

    public String getSELECT(){
        return SELECT;
    }
    public void setSELECT(String SELECT){
        this.SELECT = SELECT;
    }
    public String getFROM(){
        return FROM;
    }
    public void setFROM(String FROM){
        this.FROM = FROM;
    }
    public String getWHERE(){
        return WHERE;
    }
    public void setWHERE(String WHERE){
        this.WHERE = WHERE;
    }

    public String getORDER(){
        return ORDERBY;
    }
    public void setORDERBY(String ORDERBY){
        this.ORDERBY = ORDERBY;
    }
    @Override
    public String toString() {
        return "Query{" +
                "SELECT='" + SELECT + '\'' +
                ", FROM='" + FROM + '\'' +
                ", WHERE='" + WHERE + '\'' +
                ", ORDERBY='" + ORDERBY + '\'' +
                '}';
    }


}
