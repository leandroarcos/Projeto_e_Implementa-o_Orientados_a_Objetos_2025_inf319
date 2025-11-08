package br.unicamp.ic.inf319;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * <img src="./doc-files/Assembly.png" alt="Assembly">
 *
 * @author INF319
 */
public class Assembly extends Part {

    private final List<Part> parts;

    /**
     *
     * @param thePartNumber
     * @param theDescription
     */
    public Assembly(PartNumber thePartNumber, String theDescription) {
        super(thePartNumber, theDescription);
        parts = new LinkedList<>();
    }

    /**
     *
     * @return cost
     */
    @Override
    public double cost() {
        double totalCost = 0;
        for (Iterator<Part> i = parts.iterator(); i.hasNext();) {
            Part part = i.next();
            totalCost += part.cost();
        }
        return totalCost;
    }

    /**
     *
     * @param thePart
     */
    public void addPart(Part thePart) {
        parts.add(thePart);
    }

    /**
     *
     * @return parts
     */
    public List<Part> getParts() {
        return parts;
    }

    /**
     *
     * @return String list
     */
    @Override
    public String list() {
        return list(0);
    }

    /**
     * Implementa a operação de listagem para montagens (Assembly).
     * Lista a montagem e seus componentes, ordenados pelo código da peça,
     * com indentação crescente para cada nível de hierarquia.
     * @param indent Nível de indentação
     * @return String formatada da montagem e seus componentes
     */
    @Override
    protected String list(int indent) {
        StringBuilder sb = new StringBuilder();
        // Imprime a montagem atual com a indentação
        for (int i = 0; i < indent; i++) {
            sb.append(" ");
        }
        sb.append("Parte: ")
          .append(getPartNumber().getNumber())
          .append("; Descricao: ")
          .append(getDescription())
          .append("; Custo: ")
          .append(cost())
          .append("\n");
        // Ordena as partes pelo código
        List<Part> ordered = new LinkedList<>(parts);
        Collections.sort(ordered);
        // Lista cada componente, aumentando a indentação
        for (Part p : ordered) {
            sb.append(p.list(indent + 1));
        }
        return sb.toString();
    }
}
