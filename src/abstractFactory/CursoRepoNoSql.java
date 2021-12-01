package abstractFactory;

import abstractFactory.CursoRepo;
import abstractFactory.model.Curso;

import java.util.List;

public class CursoRepoNoSql implements CursoRepo {
    @Override
    public List<Curso> getCursos() {
        return null;
    }
}
