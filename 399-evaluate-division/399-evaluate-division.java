class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> graph = new HashMap<>();
        for(int i = 0; i < equations.size(); ++i){
            List<String> currEquation = equations.get(i);
            graph.putIfAbsent(currEquation.get(0), new HashMap<>());
            graph.putIfAbsent(currEquation.get(1), new HashMap<>());
            graph.get(currEquation.get(0)).put(currEquation.get(1), values[i]);
            graph.get(currEquation.get(1)).put(currEquation.get(0), 1/values[i]);
        }

        double[] results = new double[queries.size()];
        for(int i = 0; i < queries.size(); ++i){
            results[i] = dfs(queries.get(i).get(0), queries.get(i).get(1),
                    1.0, graph, new HashSet<>());
        }
        return results;
    }

    public double dfs(String src, String des, double res, Map<String, Map<String, Double>> graph, Set<String> visited){
        if(!graph.containsKey(src) || !graph.containsKey(des) || visited.contains(src)) return -1;
        if(Objects.equals(src, des)) return res;
        visited.add(src);
        Map<String, Double> neighbours = graph.get(src);
        double lclRes =0;
        for(String neighbour : neighbours.keySet()){
            lclRes = dfs(neighbour, des, res * neighbours.get(neighbour), graph, visited);
            if(lclRes != -1) return lclRes;
        }
        return -1;
        
    }
}