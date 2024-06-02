package service;

import exception.NumValidate;

public interface CourseService {
    abstract void addNewCourse();
    abstract void listCourse();
    abstract void findById() throws NumValidate, NumValidate;
    abstract void findByTitle();
    abstract void removeCourse();
}
