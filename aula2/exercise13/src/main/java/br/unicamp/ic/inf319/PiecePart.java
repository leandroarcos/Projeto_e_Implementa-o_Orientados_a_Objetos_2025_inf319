package br.unicamp.ic.inf319;
/**
 * <img src="./doc-files/PiecePart.png" alt="PiecePart">
 *
 * @author INF319
 */
public class PiecePart extends Part {

    private double cost;
    
    /**
     *
     * @param thePartNumber
     * @param theDescription
     * @param theCost
     */
    public PiecePart(PartNumber thePartNumber, String theDescription,
                     double theCost) {
        super(thePartNumber, theDescription);
        cost = theCost;
    }

    /**
     *
     * @return cost
     */
    @Override
    public double cost() {
        return cost;
    }
    
    /**
     * Retorna a listagem da peça simples sem indentação extra.
     */
    @Override
    public String list() {
        return list(0);
    }
    
    /**
     *
     * @param c
     */
    public void setCost(double c) {
    	cost = c;
    }

    /**
     * Implementa a listagem para uma peça simples.
     * Retorna a string formatada conforme especificação, com indentação.
     * @param indent Nível de indentação
     * @return String formatada da peça
     */
    @Override
    protected String list(int indent) {
        StringBuilder sb = new StringBuilder();
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
        return sb.toString();
    }
}
