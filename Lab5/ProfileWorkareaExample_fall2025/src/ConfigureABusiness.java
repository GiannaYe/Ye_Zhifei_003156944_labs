/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

*/
package Business;

import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.Profiles.EmployeeDirectory;
import Business.Profiles.EmployeeProfile;
import Business.Profiles.FacultyDirectory;
import Business.Profiles.FacultyProfile;
import Business.Profiles.StudentDirectory;
import Business.Profiles.StudentProfile;

import Business.UserAccounts.UserAccount;
import Business.UserAccounts.UserAccountDirectory;


/**
 *
 * @author kal bugrara
 */
class ConfigureABusiness {

    static Business initialize() {
        Business business = new Business("Information Systems");

        // ===== 创建人员（Person） =====
        PersonDirectory persondirectory = business.getPersonDirectory();

        Person person001 = persondirectory.newPerson("John Smith");   // Admin
        Person person002 = persondirectory.newPerson("Gina Montana"); // Faculty
        Person person003 = persondirectory.newPerson("Adam Rollen");  // Student

        // ===== 创建各类 Profile =====
        EmployeeDirectory employeedirectory = business.getEmployeeDirectory();
        EmployeeProfile employeeprofile0 = employeedirectory.newEmployeeProfile(person001);

        StudentDirectory studentdirectory = business.getStudentDirectory();
        StudentProfile studentprofile0 = studentdirectory.newStudentProfile(person003);

        // ✅ 新增 FacultyDirectory & FacultyProfile
        FacultyDirectory facultydirectory = business.getFacultyDirectory();
        FacultyProfile facultyprofile0 = facultydirectory.newFacultyProfile(person002);

        // ===== 创建用户账户（UserAccount） =====
        UserAccountDirectory uadirectory = business.getUserAccountDirectory();

        // 管理员账号
        UserAccount uaAdmin = uadirectory.newUserAccount(employeeprofile0, "admin", "****");

        // 学生账号
        UserAccount uaStudent = uadirectory.newUserAccount(studentprofile0, "adam", "****");

        // ✅ 教师账号（新添加）
        UserAccount uaFaculty = uadirectory.newUserAccount(facultyprofile0, "gina", "****");

        return business;
    }
}

