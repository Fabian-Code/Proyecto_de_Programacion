package checksbus;

public class Funcionarios {
    private String nombre_funcionario;
    private String empresa_que_pertenece;
    private String nombre_usuario;
    private String contraseña;
    

    public Funcionarios(String nombre_funcionario, String empresa_que_pertenece, String nombre_usuario, String contraseña) {
        this.nombre_funcionario = nombre_funcionario;
        this.empresa_que_pertenece = empresa_que_pertenece;
        this.nombre_usuario = nombre_usuario;
        this.contraseña = contraseña;
    }
    
    public String getNombre_funcionario() {
        return nombre_funcionario;
    }

    public void setNombre_funcionario(String nombre_funcionario) {
        this.nombre_funcionario = nombre_funcionario;
    }
    public boolean ValidarNombres(String nombre){
        Pattern pat = Pattern.compile("[A-Za-z]+");
        Matcher mac = pat.macher(nombre);
        return (mac.matches());
    }
    public String getEmpresaQuePertenece() {
        return empresa_que_pertenece;
    }

    public void setEmpresaQuePertenece(String empresa_que_pertenece) {
        this.empresa_que_pertenece = empresa_que_pertenece;
    }

    public String getNombreUsuario() {
        return nombre_usuario;
    }

    public void setNombreUsuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Funcionario \n" + "nombrefuncionario=" + nombre_funcionario + ", empresa que pertenece=" + empresa_que_pertenece + ", nombre_usuario=" + nombre_usuario + ", contrase\u00f1a=" + contraseña + '}';
    }
}
