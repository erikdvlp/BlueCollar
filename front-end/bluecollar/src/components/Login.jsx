import React, { Component } from 'react';
import axios from 'axios';

class Login extends Component
{
	constructor(props)
	{
		super(props);
		this.state = {username: "", password: "", rememberMe: false};
		this.handleUsernameChange = this.handleUsernameChange.bind(this);
		this.handlePasswordChange = this.handlePasswordChange.bind(this);
		this.handleSubmit = this.handleSubmit.bind(this);
	}

	handleUsernameChange(event)
	{
		this.setState({username: event.target.value});
	}

	handlePasswordChange(event)
	{
		this.setState({password: event.target.value});
	}

	handleSubmit(event)
	{
		var url = "http://localhost:9090/usermgmt/login";
		var payload = {"username" : this.state.username, "password" : this.state.password};
		console.log(payload);
		axios.post(url, payload).then(function (response)
		{
			console.log(response);
			if (response.data.code == 202)
			{
				console.log("Login successful");
			}
		}).catch(function (error)
		{
			console.log("Login failure");
			console.log(error);
		});

		event.preventDefault();
	}

	render()
	{
		return (
			<div className="login">
				<div class="loginSplash">
					<form class="loginWidget" onSubmit={this.handleSubmit}>
						<label>Username</label>
						<input class="loginField" type="text" placeholder="Enter your username" onChange={this.handleUsernameChange} required/>
						<label>Password</label>
						<input class="loginField" type="text" placeholder="Enter your password" onChange={this.handlePasswordChange} required/>
						<label><input name="rememberMe" type="checkbox" onChange={this.handleChange} />
						&nbsp; Remember me</label>
						<input type="submit" value="Log in" class="btn btn-primary"/>
					</form>
				</div>
			</div>
		)
	}
}

export default Login;