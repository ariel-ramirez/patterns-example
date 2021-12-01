package abstractFactory;

public class FactoryNoSql implements AbstractFactory {

    @Override
    public AlumnoRepo createAlumnoRepo() {
        return new AlumnoRepoNoSql();
    }

    @Override
    public CursoRepo createCursoRepo() {
        return new CursoRepoNoSql();
    }
}
