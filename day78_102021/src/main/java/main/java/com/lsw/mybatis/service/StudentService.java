package main.java.com.lsw.mybatis.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lombok.RequiredArgsConstructor;
import main.java.com.lsw.mybatis.domain.Student;
import main.java.com.lsw.mybatis.mapper.StudentMapper;



@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class StudentService {

	private final StudentMapper studentMapper;

	public List<Student> getAllStudents() {

		return studentMapper.findAll();
	}
	public Student getStudent(Long id) {
		return studentMapper.findById(id);
	}

	@Transactional
	public void createStudent(Student student) {
		studentMapper.insert(student);

	}

	@Transactional
	public void updateStudent(Student student) {
		studentMapper.update(student);
	}

	@Transactional
	public void deleteStudent(Long id) {
		studentMapper.delete(id);
	}

}
