package balance;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DBConnect {
    
    static String JDBCDriver ="com.mysql.jdbc.Driver";
    static String urlDB="jdbc:mysql://localhost:3306/balance";
    static String userName="Hemmat";
    static String password="";
    
    
    public ResultSet rs;
    public Statement st;

    public DBConnect() {
        try{
       Connection conn = DriverManager.getConnection(urlDB,userName,password);
     st = conn.createStatement();
        }catch(Exception e){
            Helper.showNotification("We did not connect to database");
        }
    }
    
    public  ResultSet excuteQurey(String query){
       try{
           return st.executeQuery(query);
       }catch(SQLException e){
           System.out.println("We can not run the qurey");
           return rs;
       }
    }
    
      public  boolean excute(String query){
       try{
            st.execute(query);
            return true;
       }catch(SQLException e){
           System.out.println("We can not run the qurey");
           return false;
           
       }
    }
    
         public static String covertPassword(char[] password){
        String fixPassword = "";
        for(char c: password){
            fixPassword+=c;
        }
        return fixPassword;
    }
    
    
  public Object[][] select_table(String Query) {
        try {
            rs = st.executeQuery(Query);
            rs.last();  // go to last row
            int lastrow = rs.getRow(); // that go to last row and save finaly length      need for array
            rs.beforeFirst();  // then came back
            int lastColum = rs.getMetaData().getColumnCount();   // the count all colum    need for array
            
            Object Data[][] = new Object[lastrow][lastColum];

            int y = 0;
            while (rs.next()) {
                for (int x = 0; x < lastColum; x++) {
                    Data[y][x] = rs.getObject(x+1);    /*از ریزل سیت میگیری کالم ایکس ام را به علاوه یک   
                    getObject(x) -> columnIndex - the first column is 1, the second is 2, ... and save object
                     the give value of rs.getObject(x+1) and save in Array (Data[y][x]) 
                     */
                    }
                y++;   // after finshed all colum go to next record to row
            }
            return Data;

        } catch (SQLException ex) {
            Logger.getLogger(DBConnect.class.getName()).log(Level.SEVERE, null, ex);
            Object[][] EmptyData = null;
            return EmptyData;   // return msut be nothing for degbag bescause try and if every one must returned
        }

    }
    
    
    
}
