package com.example;

public class Samsung {
    private Processor processor;

    public Samsung(Processor processor) {
        this.processor = processor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void config() {
        System.out.println("12gb Ram, 50Mp, 5000Mah");
        processor.process();
    }
}
}
