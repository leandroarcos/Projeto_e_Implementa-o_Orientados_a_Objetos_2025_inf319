package br.unicamp.ic.inf319;

import java.util.Objects;

/**
 * <img src="./doc-files/Part.png" alt="Part">
 *
 * @author INF319
 */
@SuppressWarnings("rawtypes")
public abstract class Part implements Comparable {

    private String description;
    private final PartNumber partNumber;
    
    /**
     *
     * @param thePartNumber
     * @param theDescription
     */
    public Part(PartNumber thePartNumber, String theDescription) {
        description = theDescription;
        partNumber = thePartNumber;
    }
    
    /**
     *
     * @return cost
     */
    public abstract double cost();
    
    /**
     * Implementa a operação de listagem genérica para partes.
     * Este método serve como base para as subclasses, permitindo
     * que a indentação seja controlada recursivamente.
     * Por padrão, retorna a listagem sem indentação.
     */
    public String list() {
        return list(0);
    }

    /**
     * Método protegido para listagem com indentação.
     * Cada subclasse implementa sua própria lógica de listagem.
     * @param indent Nível de indentação
     * @return String formatada da parte
     */
    protected abstract String list(int indent);

    /**
     *
     * @return description
     */
    public String getDescription() {
    	return description;
    }
    
    /**
     *
     * @param desc
     */
    public void setDescription(String desc) {
    	description = desc;
    }

    /**
     *
     * @return partNumber
     */
    public PartNumber getPartNumber() {
        return partNumber;
    }
    /**
     * 
     * @param o
     * @return equals
     */
    @Override
    public boolean equals(Object o) {
    	if (o instanceof Part) {
    	Part part = (Part) o;
    	return partNumber.getNumber() == part.partNumber.getNumber();
    	}
    	return false;
    }
    /**
     * 
     * @return hashCode
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.partNumber);
        return hash;
    }

    /**
     * 
     * @param o
     * @return compareTo
     */
    @Override
    public int compareTo(Object o) {
        if (partNumber.getNumber() > ((Part) o).partNumber.getNumber()) {
            return 1;
        } else if (partNumber.getNumber() < ((Part) o).partNumber.getNumber()) {
            return -1;
        }
        return 0;
    }
    
    
}
