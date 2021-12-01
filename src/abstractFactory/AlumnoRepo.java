package abstractFactory;

import abstractFactory.model.Alumno;

import java.util.List;

public interface AlumnoRepo {
    List<Alumno> getAlumnos();
}
