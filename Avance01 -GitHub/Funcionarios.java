package checksbus;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Funcionarios {
    private String nombrefuncionario;
    private String empresaquepertenece;
    private String nombreusuario;
    private String contraseña;
    

    public Funcionarios(String nombre_funcionario, String empresa_que_pertenece, String nombre_usuario, String contraseña) {
        this.nombrefuncionario = nombre_funcionario;
        this.empresaquepertenece = empresa_que_pertenece;
        this.nombreusuario = nombre_usuario;
        this.contraseña = contraseña;
    }

    public String getNombre_funcionario() {
        return nombrefuncionario;
    }

    public void setNombre_funcionario(String nombre_funcionario) {
        this.nombrefuncionario = nombre_funcionario;
    }
    public boolean ValidarNombres(String nombre){
        Pattern pat = Pattern.compile("[A-Za-z]+");
        Matcher mac = pat.matcher(nombre);
        return (mac.matches());
    }

    public String getEmpresaQuePertenece() {
        return empresaquepertenece;
    }

    public void setEmpresaQuePertenece(String empresa_que_pertenece) {
        this.empresaquepertenece = empresa_que_pertenece;
    }

    public String getNombreUsuario() {
        return nombreusuario;
    }

    public void setNombreUsuario(String nombre_usuario) {
        this.nombreusuario = nombre_usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return "Funcionario \n" + "nombrefuncionario:" + nombrefuncionario + "\t empresa que pertenece:" + empresaquepertenece + ", nombre_usuario=" + nombreusuario + ", contraseña=" + contraseña ;
    }
}
