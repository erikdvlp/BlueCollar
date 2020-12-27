import React, { Component } from 'react';

class Login extends Component
{
	constructor(props)
	{
		super(props);
		this.state = {username: "", password: "", rememberMe: false};
		this.handleChange = this.handleChange.bind(this);
		this.handleSubmit = this.handleSubmit.bind(this);
	}

	handleChange(event)
	{
		this.setState({value: event.target.value});
	}

	handleSubmit(event)
	{
		alert("Log-in functionality pending");
		event.preventDefault();
	}

	render()
	{
		return (
			<div className="login">
				<div class="loginSplash">
					<form class="loginWidget" onSubmit={this.handleSubmit}>
						<label>Username</label>
						<input class="loginField" type="text" placeholder="Enter your username" onChange={this.handleChange} required/>
						<label>Password</label>
						<input class="loginField" type="text" placeholder="Enter your password" onChange={this.handleChange} required/>
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