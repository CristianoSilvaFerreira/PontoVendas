package usuarios;


public class Usuarios {
    
    public static String LISTAR_US = "SELECT * FROM usuarios ORDER BY nome_us";
    
    public static String REGISTRAR = "INSERT INTO usuarios(codigo_us, nome_us, sexo_us, tipo_us, senha) "
            + "VALUES(?,?,?,?,?)";
    
    public static String ATUALIZAR = "UPDATE usuarios SET "
                + "nome_us=?, "
                + "sexo_us=?, "
                + "tipo_us=?, "
                + "senha=? WHERE codigo_us=?";
    
    public static String ELIMINAR = "DELETE FROM usuarios WHERE codigo_us = ?";
    
    public static String ELIMINAR_TUDO = "DELETE FROM usuarios";
    
    private String primaryKey;
    private String nome;
    private String sexo;
    private String tipouser;
    private String senha;

    public Usuarios(){
        
    }

    public String getPrimaryKey() {
        return primaryKey;
    }

    public void setPrimaryKey(String primaryKey) {
        this.primaryKey = primaryKey;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTipouser() {
        return tipouser;
    }

    public void setTipouser(String tipouser) {
        this.tipouser = tipouser;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
