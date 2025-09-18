# ===========================================
# ICT3104 Assessment 3 - Car Evaluation Dataset
# Tasks 5–8: EDA, Decision Tree (Entropy), Report, Results
# ===========================================

# Import libraries
import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns
from sklearn.preprocessing import LabelEncoder
from sklearn.model_selection import train_test_split
from sklearn.tree import DecisionTreeClassifier, plot_tree
from sklearn.metrics import classification_report, confusion_matrix, accuracy_score

# --------------------------
# Load Dataset (Task 5: EDA)
# --------------------------
columns = ["buying", "maint", "doors", "persons", "lug_boot", "safety", "class"]
df = pd.read_csv("car_evaluation.csv", names=columns, header=None)

print("Dataset shape:", df.shape)
print("\nFirst 5 rows:")
print(df.head())

print("\nClass distribution:")
print(df['class'].value_counts())

# Plot class distribution
plt.figure(figsize=(6,4))
sns.countplot(x="class", data=df, order=df['class'].value_counts().index)
plt.title("Car Acceptability Distribution")
plt.savefig("class_distribution.png")  # save screenshot
plt.show()

# Plot attribute distributions
for col in df.columns[:-1]:
    plt.figure(figsize=(6,4))
    sns.countplot(x=col, data=df, order=df[col].value_counts().index)
    plt.title(f"Distribution of {col}")
    plt.savefig(f"{col}_distribution.png")
    plt.show()

# --------------------------
# Encode Categorical Features
# --------------------------
df_encoded = df.apply(LabelEncoder().fit_transform)

X = df_encoded.drop("class", axis=1)
y = df_encoded["class"]

# --------------------------
# Train-Test Split
# --------------------------
X_train, X_test, y_train, y_test = train_test_split(
    X, y, test_size=0.3, random_state=42, stratify=y
)

# --------------------------
# Decision Tree Classifier (Task 6)
# --------------------------
clf = DecisionTreeClassifier(criterion="entropy", random_state=42, max_depth=None)
clf.fit(X_train, y_train)

# --------------------------
# Classification Report (Task 7)
# --------------------------
y_pred = clf.predict(X_test)

print("\nClassification Report:\n")
print(classification_report(y_test, y_pred))

print("Confusion Matrix:\n")
print(confusion_matrix(y_test, y_pred))

print("Overall Accuracy:", accuracy_score(y_test, y_pred))

# Confusion matrix heatmap
plt.figure(figsize=(6,4))
sns.heatmap(confusion_matrix(y_test, y_pred), annot=True, fmt="d", cmap="Blues")
plt.title("Confusion Matrix")
plt.xlabel("Predicted")
plt.ylabel("Actual")
plt.savefig("confusion_matrix.png")
plt.show()

# --------------------------
# Visualize Decision Tree
# --------------------------
plt.figure(figsize=(16,10))
plot_tree(clf, feature_names=X.columns, class_names=df['class'].unique(), filled=True)
plt.title("Decision Tree Classifier (Entropy)")
plt.savefig("decision_tree.png")
plt.show()

# --------------------------
# Feature Importance (Task 8: Results)
# --------------------------
importances = clf.feature_importances_
feature_importance = pd.DataFrame({
    "Feature": X.columns,
    "Importance": importances
}).sort_values(by="Importance", ascending=False)

print("\nFeature Importance:\n", feature_importance)

# Plot feature importance
plt.figure(figsize=(6,4))
sns.barplot(x="Importance", y="Feature", data=feature_importance)
plt.title("Feature Importance in Decision Tree")
plt.savefig("feature_importance.png")
plt.show()
