package model;

public class Gate extends  BaseModel {
    private GateType type;
    private GateStatus status;
    private Operator operator;

    public Gate(GateType type, Operator operator, GateStatus status) {
        this.type = type;
        this.operator = operator;
        this.status = status;
    }

    public GateType getType() {
        return type;
    }

    public void setType(GateType type) {
        this.type = type;
    }

    public GateStatus getStatus() {
        return status;
    }

    public void setStatus(GateStatus status) {
        this.status = status;
    }

    public Operator getOperator() {
        return operator;
    }

    public void setOperator(Operator operator) {
        this.operator = operator;
    }
}
