const fetchRecommendations = async (selectedSkills) => {
  try {
    const response = await fetch('http://localhost:8081/api/recommendations', {
      method: 'POST',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify({ selectedSkills })
    });
    if (!response.ok) {
      throw new Error('Failed to fetch recommendations');
    }
    return await response.json();
  } catch (error) {
    console.error('Error fetching recommendations:', error);
    throw error;
  }
};

export { fetchRecommendations };