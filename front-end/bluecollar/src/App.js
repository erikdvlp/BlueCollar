import React from 'react';
import {BrowserRouter as Router, Switch, Route, Link} from 'react-router-dom';
import Login from './components/Login';
import About from './components/About';
import Contact from './components/Contact';
import Home from './components/Home';
import 'bootstrap/dist/css/bootstrap.css';
import './App.css';

function App()
{
	return (
		<div class="App">
			<Router>
				<nav class="navbar navbar-expand-lg navbar-light bg-light">
					<div class="container-fluid">
						<a class="navbar-brand">BlueCollar</a>
						<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
						<span class="navbar-toggler-icon"></span>
						</button>
						<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
							<div class="navbar-nav">
								<Link exact to="/" class="nav-link active">Home</Link>
								<Link exact to="/about" class="nav-link active">About us</Link>
								<Link exact to="/contact" class="nav-link active">Contact us</Link>
								<Link exact to="/login"><button class="btn btn-primary" type="button">Log in</button></Link>
							</div>
						</div>
					</div>
				</nav>
				<Switch>
					<Route path="/login">
						<Login />
					</Route>
					<Route path="/about">
						<About />
					</Route>
					<Route path="/contact">
						<Contact />
					</Route>
					<Route path="/">
						<Home />
					</Route>
				</Switch>
			</Router>
		</div>
	);
}

export default App;