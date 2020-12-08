# BlueCollar

BlueCollar is a service that connects hands-on workers (e.g. plumbers, electricians) with clients that need home services done. Workers are typically freelance but can be associated with a company as well. Clients post jobs that they need done. Workers can view open jobs and bid on them. Clients can also search for and view workers that specialize in their job type and message them. Through messaging, they can agree on a price and appointment. After the appointment, clients and workers can rate and review one another.

## Front-end

### Pages
* Home page
  * Marketing splash screen to attract new users
  * Link to log-in page at top-right
* Contact us page
  * Static contact information and/or email form
* Log-in page
  * Universal log-in for clients and workers
* Register page
  * Contains fields for registering a new client or worker account
* Browse page
  * Shows relevant default search results and allows searching for workers (if client) or jobs (if worker)
* User page
  * Contains user-specific information, including personal details, open jobs, and account settings
* Messaging page
  * Displays all messaging conversations between clients and workers

## Back-end

## Database
### SQL
* User
  * user_id (int)
  * worker (boolean)
  * first_name (varchar)
  * last_name (varchar)
  * email (varchar)
  * rating (int)
  * active (boolean)
  * city (varchar)
  * province (varchar)
  * country (varchar)
  * username (varchar)
  * password_hash (varchar)
* Job
  * job_id (int)
  * client_id (int)
  * worker_id (int)
  * jobcategory_id (int)
  * text (varchar)
  * status (int)
* JobCategory
  * jobcategory_id (int)
  * name (varchar)
* Review
  * review_id (int)
  * client_id (int)
  * worker_id (int)
  * rating (int)
  * text (varchar)
* Login
  * user_id (int)
  * timestamp (datetime)
  * ip (varchar)
* Search
  * user_id (int)
  * timestamp (datetime)
  * ip (varchar)
  * text (varchar)
### NoSQL
* Chats
