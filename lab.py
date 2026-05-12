from sklearn.feature_extraction.text import TfidfVectorizer
from sklearn.metrics.pairwise import cosine_similarity

text = [
    "Machine learning is fascinating",
    "Deep learning is a subset of machine learning",
    "Natural language processing uses machine learning",
    "I love playing football"
]

vec = TfidfVectorizer()
x = vec.fit_transform(text)

mat_y = cosine_similarity(x)

print("Similarity Score Matrix  :", mat_y)
