package abstractFactory;

public class FactoryRelacional implements AbstractFactory {
    @Override
    public AlumnoRepo createAlumnoRepo() {
        return new AlumnoRepoRelacional();
    }

    @Override
    public CursoRepo createCursoRepo() {
        return new CursoRepoRelacional();
    }
}
