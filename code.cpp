#include <iostream>
#include <vector>
using namespace std;

int main() {
	
	int tc; 
	cin>>tc;
	
	while(tc--)
	{
	    int x,y,n,r, a, b;
	    cin>>x>>y>>n>>r;

		bool isSolved = false;

		// for (int i = 0; i <= n; i++) {
		// 	a = i;
		// 	b = n-a;
			
		// 	if((x*a + y*b) <= r){
		// 		cout<<a<<" "<<b;
		// 		isSolved = true;
		// 		break;
		// 	}
			
		// }

		a = 0;
		while (a <= n)
		{
			b = n-a;

			if((x*a + y*b) <= r){
				cout<<a<<" "<<b;
				isSolved = true;
				break;
			}

			a++;
		}
		

		if (!isSolved) {
			cout<<-1;
		}
	}
	return 0;
}