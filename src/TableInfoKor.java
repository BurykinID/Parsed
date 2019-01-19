import java.util.HashMap;

public class TableInfoKor {

    HashMap<String, String> col1;
    HashMap<String, String> col2;
    HashMap<String, String> col3;
    HashMap<String, String> col4;
    HashMap<String, String> col5;
    HashMap<String, String> col6;
    HashMap<String, String> col7;
    HashMap<String, String> col8;

    public TableInfoKor(HashMap<String, String> col1,
                        HashMap<String, String> col2,
                        HashMap<String, String> col3,
                        HashMap<String, String> col4,
                        HashMap<String, String> col5,
                        HashMap<String, String> col6,
                        HashMap<String, String> col7,
                        HashMap<String, String> col8){
        this.col1 = col1;
        this.col2 = col2;
        this.col3 = col3;
        this.col4 = col4;
        this.col5 = col5;
        this.col6 = col6;
        this.col7 = col7;
        this.col8 = col8;
    }

    private void setTableInfoKor(HashMap<String, String> col1,
                                 HashMap<String, String> col2,
                                 HashMap<String, String> col3,
                                 HashMap<String, String> col4,
                                 HashMap<String, String> col5,
                                 HashMap<String, String> col6,
                                 HashMap<String, String> col7,
                                 HashMap<String, String> col8){
        this.col1 = col1;
        this.col2 = col2;
        this.col3 = col3;
        this.col4 = col4;
        this.col5 = col5;
        this.col6 = col6;
        this.col7 = col7;
        this.col8 = col8;
    }

    private HashMap<String, String> getCol1(){
        return col1;
    }

    private HashMap<String, String> getCol2(){
        return col2;
    }

    private HashMap<String, String> getCol3(){
        return col3;
    }

    private HashMap<String, String> getCol4(){
        return col4;
    }

    private HashMap<String, String> getCol5(){
        return col5;
    }

    private HashMap<String, String> getCol6(){
        return col6;
    }

    private HashMap<String, String> getCol7(){
        return col7;
    }

    private HashMap<String, String> getCol8(){
        return col8;
    }


}
