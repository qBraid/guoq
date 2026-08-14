package qoptimizer;

import qoptimizer.circuit.CircuitDAG;

public interface IPartitionPicker {

    int MAX_PARTITION_QUBITS = Integer.parseInt(System.getenv().getOrDefault("GUOQ_MAX_PARTITION_QUBITS", "3"));

    CircuitDAG getPartition(CircuitDAG circuit);

}
