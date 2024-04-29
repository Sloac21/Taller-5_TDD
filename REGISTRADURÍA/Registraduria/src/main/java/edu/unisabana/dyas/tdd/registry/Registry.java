package edu.unisabana.dyas.tdd.registry;

public class Registry {
    public RegisterResult registerVoter(Person p) {
        if (p.getAge() < 0) {
            return RegisterResult.INVALID_AGE;
        } else if (!p.isAlive()) {
            return RegisterResult.DEAD;
        } else if (p.getAge() < 18) {
            return RegisterResult.UNDERAGE;
        } else if (p.getGender() == Gender.UNIDENTIFIED) {
            return RegisterResult.INVALID_GENDER;
        } else {
            return RegisterResult.VALID;
        }
    }
}
