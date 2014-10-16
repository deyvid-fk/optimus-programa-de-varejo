package com.nicetech.optimus.model.bo;

import com.nicetech.optimus.model.dao.DaoModuloAcesso;
import com.nicetech.optimus.model.vo.ModelModuloAcesso;
import com.nicetech.optimus.utils.Menu;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import static java.util.logging.Logger.getLogger;


public class ModuloAcesso {

    public void addModuloAcesso(String idUser, List menu) {
        List<ModelModuloAcesso> list;
        list = new ArrayList<>();

        ModelModuloAcesso moduloAcesso = new ModelModuloAcesso();
        moduloAcesso.setFlag(1);
        moduloAcesso.setModulo(menu);
        moduloAcesso.setIdUser(idUser);
        list.add(moduloAcesso);

        DaoModuloAcesso dao = new DaoModuloAcesso();
        dao.createXml(list);
    }

    public List getModuloAcesso(String idUser) {
        DaoModuloAcesso dao = new DaoModuloAcesso();
        List<ModelModuloAcesso> menus;
        menus = (List<ModelModuloAcesso>) dao.readXml();

        for (ModelModuloAcesso moduloAcesso : menus) {
            if (moduloAcesso.getIdUser().equals(idUser)) {
                return moduloAcesso.getModulo();
            }
        }
        return getModuloAcessoDefault();
    }

    public List getModuloAcessoDefault() {
        List menus = new ArrayList<>();
        menus.add(Menu.SISTEMA);
        return menus;
    }
    private static final Logger LOG = getLogger(ModuloAcesso.class.getName());
}
