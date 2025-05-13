public String getSignature() {
    if (firstName == null || firstName.isEmpty()) {
        return lastName;
    }
    
    char initial = firstName.charAt(0);
    return initial + "-" + lastName;
}
