import sqlite3

db = "local_db.db"

def createDb():
	print("Creating/overwriting local database")
	with open("create_tables.sql", "r") as f:
		script = f.read()
	conn = sqlite3.connect(db)
	cursor = conn.cursor()
	cursor.executescript(script)
	conn.commit()
	conn.close()
	print("Finished creating/overwriting local database")

def showTables():
	print("Tables created:")
	conn = sqlite3.connect(db)
	resp = conn.execute("select name from sqlite_master where type='table';")
	for r in resp:
		print("* " + r[0])
	conn.close()

createDb()
showTables()