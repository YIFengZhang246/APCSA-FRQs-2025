public Round(String[] names) {
    competitorList = new ArrayList<Competitor>();
    for (int i = 0; i < names.length; i++) {
        Competitor comp = new Competitor(names[i], i + 1);
        competitorList.add(comp);
    }
}
