package br.com.otta.enterpriseApi.model;

import java.util.Arrays;

/**
 * Enum para listar os tipos de empresa.
 *
 * @author Guilherme
 *
 */
public enum EnterpriseType {
    UNKNOWN(0), CLOTHES(1), IT(2), METALLURGY(3);

    private int id;

    private EnterpriseType(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }
    
    public static EnterpriseType findById(int id) {
        return Arrays.stream(values())
                .filter(type -> type.getId() == id).findFirst()
                .orElse(UNKNOWN);
    }

}
