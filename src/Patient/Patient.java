package Patient;

/**
 * @param id        id of the patient
 * @param lastName  last name of the patient
 * @param firstName first name of the patient
 * @param birthday  birthday of the patient
 * @param email     email of the patient
 * @param phone     phone number of the patient
 */
public record Patient(String id, String lastName, String firstName, String birthday, String email, String phone) {
    /**
     * @param obj the reference object with which to compare.
     * @return true if this object is the same as the obj argument; false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Patient patient) {
            return patient.id.equals(id);
        }
        return false;
    }
}