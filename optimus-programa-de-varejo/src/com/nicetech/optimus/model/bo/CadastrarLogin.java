package com.nicetech.optimus.model.bo;

import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;


public class CadastrarLogin {

 /*   public boolean cadastrar(ModelLogin login) {
        try {
            if (isValid(login)) {
                for (int i = 0; i < getLogin().size(); i++) {
                    if (getLogin().get(i).getId().equals(login.getId())) {
                        DaoLogin.getLogin().get(i).setUsername(login.getUsername());
                        DaoLogin.getLogin().get(i).setPass(login.getPass());
                        DaoLogin.getLogin().get(i).setModulo(login.getModulo());
                        createXml(getLogin());
                        return true;
                    }
                }
                DaoLogin.getLogin().add(login);
                createXml(getLogin());
                return true;
            }
        } catch (GeneralSecurityException | IOException e) {
            showMessageDialog(null, e.getMessage());
            getLogger(Resource.class.getName()).log(Level.SEVERE, null, e);
        }
        return false;
    }
*/
    private static final Logger LOG = getLogger(CadastrarLogin.class.getName());
}
