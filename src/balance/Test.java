//
//package balance;
//
//public class Test {
//
//
//    public static void main(String[] args) {
//        DBConnect c=  new DBConnect();
//        
//          DAL d = new DAL();
//                String UserComond = "SELECT * FROM users WHERE username='" + username + "'AND password=PASSWORD('" + password + "')";
//                d.rs = d.st.executeQuery(UserComond);
//                d.rs.next();
//            DAL.username= d.rs.getString("username"); //need for change password
//              int login_id = d.rs.getInt("user_id");
//                
//        d.rs.getRow() == 1
//                
//    }

//    
//}

//        Helper.Tools.setCenter(this);
//        DAL d = new DAL();
//        Object result[][] = d.select_table("SELECT goods_id, goods_goods , goods_model, goods_item, goods_cost FROM goods");
//        String Table[] = {"ID", "Name", "Model", "Items", "Cost"};
//        table_goods_list = new JTable(result, Table);
//        jScrollPane1.setViewportView(table_goods_list);
