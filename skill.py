from sentence_transformers import SentenceTransformer
from sklearn.metrics.pairwise import cosine_similarity

model = SentenceTransformer('all-MiniLM-L6-v2')

prompt = """
You are a senior software engineer with experience in machine learning, NLP, and backend development.
Python developer with experience in machine learning, NLP, and backend development.
Worked on Flask, FastAPI, and data analysis using Pandas and NumPy.
"""

job_description = """
Looking for a Python developer skilled in machine learning, NLP, APIs, and backend systems.
Experience with data analysis and frameworks like Flask or FastAPI is required.
"""

embeddings = model.encode([prompt, job_description])

similarity_score = cosine_similarity([embeddings[0]], [embeddings[1]])[0][0]

resume_score = round(similarity_score * 100, 2)

print("Resume Score:", resume_score, "%")