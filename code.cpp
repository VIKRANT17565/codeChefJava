#include <iostream>
#include <vector>
using namespace std;

int main() {
	
	int tc; 
	cin>>tc;
	
	while(tc--)
	{
	    int n;
	    cin>>n;
	    
        int v[n];

	    for(int i = 0 ; i < n; i++)
	    {
	        cin>>v[i];
	    }
	    int count = 1;
	    int two = 0;
	    int result = 0;
	    
	    for(int i = 0; i < n; i++)
	    {
	        if(v[i] == 1)
	        {
	        result += n - count;
	        count++;
	        }
	        
	        if(v[i] == 2)
	        {
	        result += two;
	        two++;
	            
	        }
	    }
	    
	    cout<<result<<endl;
	}
	return 0;
}