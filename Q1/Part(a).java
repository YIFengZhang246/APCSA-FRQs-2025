public int walkDogs(int hour) {
  int available = company.numAvailableDogs(hour);
  if (available <= maxDogs) {
    company.updateDogs(hour, available);
    return available;
  }
  company.updateDogs(hour, maxDogs);
  return maxDogs;
}
