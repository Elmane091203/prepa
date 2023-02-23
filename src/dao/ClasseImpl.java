package dao;

import entity.Classe;
import entity.Etudiant;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class ClasseImpl implements IClasse {
    private DB db= new DB();
    private ResultSet rs;
    private int ok;
    @Override
    public int add(Classe classe) {
        String sql = "INSERT INTO classe VALUES (null,?,?)";
        try {
            db.initPrepar(sql);
            db.getPstm().setString(1,classe.getNom());
            db.getPstm().setInt(2,classe.getEffectif());
            ok = db.executeMaj();
        }catch (Exception e){
            e.printStackTrace();
        }
        return ok;
    }

    @Override
    public int update(Classe classe) {
        String sql = "UPDATE classe SET nom=?, effectif=? WHERE id=?";
        try {
            db.initPrepar(sql);
            db.getPstm().setString(1,classe.getNom());
            db.getPstm().setInt(2,classe.getEffectif());
            db.getPstm().setInt(3,classe.getId());
            ok = db.executeMaj();
        }catch (Exception e){
            e.printStackTrace();
        }
        return ok;
    }

    @Override
    public int delete(int id) {
        String sql = "DELETE FROM classe WHERE id = ?";
        try {
            db.initPrepar(sql);
            db.getPstm().setInt(1,id);
            ok = db.executeMaj();
        }catch (Exception e){
            e.printStackTrace();
        }
        return ok;
    }

    @Override
    public List<Classe> list() {
        List<Classe> list = null;
        String sql = "SELECT * FROM classe";
        try {
            db.initPrepar(sql);
            rs = db.executeSelect();
            while (rs.next()){
                Classe classe = new Classe();
                classe.setId(rs.getInt(1));
                classe.setNom(rs.getString(2));
                classe.setEffectif(rs.getInt(3));
                list.add(classe);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public Classe get(int id) {
        Classe c = null;
        String sql = "Select * from classe where id=?";
        try {
            db.initPrepar(sql);
            db.getPstm().setInt(1,id);
            rs = db.executeSelect();
            if (rs.next()){
                c.setId(rs.getInt(1));
                c.setNom(rs.getString(2));
                c.setEffectif(rs.getInt(1));
            }

        }catch (Exception e){
            e.printStackTrace();
        }
        return c;
    }
}
