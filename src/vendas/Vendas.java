package vendas;


public class Vendas {
    public static String LISTAR = "SELECT * FROM vendas ORDER BY data_ven";
    
    public static String REGISTRAR = "INSERT INTO vendas(numero_ven, total_ven, data_ven) "
            + "VALUES(?,?,?)";
    
    public static String ELIMINAR = "DELETE FROM vendas WHERE numero_ven = ?";
    
    public static String ELIMINAR_TUDO = "DELETE FROM vendas";
    
    private String primaryKey;
    private String total;
    private String data;

    public Vendas(){
        
    }

    public String getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
