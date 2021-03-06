package edu.mum.mumsched.service;

import edu.mum.mumsched.model.Course;
import edu.mum.mumsched.model.Faculty;

import java.util.List;

public interface IFacultyService {
    public Faculty findById(Integer facultyId);
    public void delete(Integer facultyId);
    public void save(Faculty faculty);
    public List<Faculty> findAll();
    public Faculty findByEmail(String email);
    public List<Faculty> findAllByPreferredCoursesContains(Course course);
}
