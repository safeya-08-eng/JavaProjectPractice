package org.example;

    public class Student {
        private String name;
        private String gender;
        private int regNo;
        private String email;
        private String dob;

        public Student(String name, String gender, int regNo, String email, String dob) {
            this.name = name;
            this.gender = gender;
            this.regNo = regNo;
            this.email = email;
            this.dob = dob;
        }

        public String getName() { return name; }
        public String getGender() { return gender; }
        public int getRegNo() { return regNo; }
        public String getEmail() { return email; }
        public String getDob() { return dob; }
    }

