package model;

public class Gate {
    private String id;
    private GateType type;
    private Operator operator;

    public Gate(String id, GateType type, Operator operator) {
        this.id = id;
        this.type = type;
        this.operator = operator;
    }

    public String getId() {
        return id;
    }

    public GateType getType() {
        return type;
    }

    public Operator getOperator() {
        return operator;
    }
}
