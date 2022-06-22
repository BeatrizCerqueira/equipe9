package TRIVIA_GAME;


public class Admin extends Usuario {

    private String login;
    String senha;

     /**
     * Construtor Admin.
     * @param nome nome do usu�rio admin
     */
    public Admin(String nome){
    	super(nome);
    }

    public void dadosAdmin(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }
  /**
     * Retorna senha do usu�rio.
     * @param senha senha do usu�rio
     * @return retorna a senha
     */

    public String getSenha() {
        return senha;
    }
   /**
     * Retorna tipo do usu�rio.
     * @param tipo tipo do usu�rio
     * @return retorna o tipo
     */

    public void setLogin(String login) {
        this.login = login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
     /**
     * compara usu�rios.
     * @param  admin 
     * @return retorna true or false para a compara��o 
     */
    public boolean equalsAdmin(Object admin) {
        Admin outroAdmin = (Admin)admin;
        return login.equals(outroAdmin.login);
    }
	
}
