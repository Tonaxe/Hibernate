    package org.example.Entities;

    public class Player {
        private int id;
        private String surname;
        private String forename;

        public Player(int id, String surname, String forename) {
            this.id = id;
            this.surname = surname;
            this.forename = forename;
        }

        public Player() {
        }


        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getSurname() {
            return surname;
        }

        public void setSurname(String surname) {
            this.surname = surname;
        }

        public String getForename() {
            return forename;
        }

        public void setForename(String forename) {
            this.forename = forename;
        }

        @Override
        public String toString() {
            return "Player [id=" + id + ", surname=" + surname + ", forename=" + forename + "]";
        }
    }

