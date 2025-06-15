package model;

public class Gate {
    private String id;
    private GateType type;
    private GateStatus status;
    private Operator operator;

    public Gate(String id, GateType type, Operator operator, GateStatus status) {
        this.id = id;
        this.type = type;
        this.operator = operator;
        this.status = status;
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

    public GateStatus getStatus() {
        return status;
    }

    public void setStatus(GateStatus status) {
        this.status = status;
    }

    public void setoperator(Operator operator) {
        this.operator = operator;
    }
}
