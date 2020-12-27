import React from 'react';

class HomeNav extends React.Component
{
	render()
	{
		return (
			<div class="homeNav">
				<nav class="navbar navbar-expand-lg navbar-light bg-light">
					<div class="container-fluid">
						<a class="navbar-brand" href="#">BlueCollar</a>
						<button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarNavAltMarkup" aria-controls="navbarNavAltMarkup" aria-expanded="false" aria-label="Toggle navigation">
						<span class="navbar-toggler-icon"></span>
						</button>
						<div class="collapse navbar-collapse" id="navbarNavAltMarkup">
							<div class="navbar-nav">
								<a class="nav-link active" aria-current="page" href="#">Home</a>
								<a class="nav-link" href="#" aria-disabled="true">About us</a>
								<a class="nav-link" href="#" aria-disabled="true">Contact us</a>
								<button class="btn btn-primary" type="button">Log in</button>
							</div>
						</div>
					</div>
				</nav>
			</div>
		);
	}
}

export default HomeNav;