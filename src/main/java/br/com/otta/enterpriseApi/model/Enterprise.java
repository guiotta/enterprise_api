package br.com.otta.enterpriseApi.model;

import java.util.Objects;

/**
 * Modelo simples, sem nada de mais.
 * 
 * @author Guilherme
 *
 */
public class Enterprise {
    private long id;
    private String name;
    private EnterpriseType type;

    public Enterprise() {
        // Do nothing.
    }

    public Enterprise(long id, String name, EnterpriseType type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseType getType() {
        return type;
    }

    public void setType(EnterpriseType type) {
        this.type = type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, type);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Enterprise)) {
            return false;
        }
        Enterprise other = (Enterprise) obj;
        return id == other.id && Objects.equals(name, other.name) && type == other.type;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Enterprise [id=");
        builder.append(id);
        builder.append(", name=");
        builder.append(name);
        builder.append(", type=");
        builder.append(type);
        builder.append("]");
        return builder.toString();
    }
}
