package classwork.chapter3;

public class ScopeErr {
    int bar = 1;
    {
        int bar = 2;

    }
}
