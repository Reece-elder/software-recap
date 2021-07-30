public static void printsFirst() {
    syso("Im first!");
}

public static void printsSecond() {
    syso("Im second!");
}

public static String printsLast() {
    return "I'm Last :("
}

public static void main (String[] args) {
    method1();
    method2();
    syso(method3());
}

public static void main (String[] args) {
    method2();
    method3();
    syso(method1());
}



