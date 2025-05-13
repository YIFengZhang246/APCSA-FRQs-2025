public String addSignature(String text) {
    String signature = getSignature();

    if (text.endsWith(signature)) {
        // Case 1: Signature is already at the end
        return text;
    } else if (text.startsWith(signature)) {
        // Case 2: Signature is at the beginning
        return text.substring(signature.length()) + signature;
    } else {
        // Case 3: Signature is not present
        return text + signature;
    }
}
